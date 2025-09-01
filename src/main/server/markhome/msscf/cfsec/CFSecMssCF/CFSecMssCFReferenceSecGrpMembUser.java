
// Description: Java 11 MssCF Reference for SecGrpMemb Relationship User.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.sql.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;

/**
 *	CFSecMssCFReferenceSecGrpMembUser binds SecGrpMemb.User
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceSecGrpMembUser
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceSecGrpMembUser() {
		super();
	}

	public CFSecMssCFReferenceSecGrpMembUser( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecGrpMemb",
			"User",
			"SecUser" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceSecGrpMembUser.dereference() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext.getGenDef()" );
		}

		ICFSecSecUserObj obj;

		if( genDef instanceof ICFSecSecGrpMembObj ) {
			obj = (ICFSecSecUserObj)((ICFSecSecGrpMembObj)genDef).getRequiredParentUser();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecGrpMembObj" );
		}

		return( obj );
	}
}
