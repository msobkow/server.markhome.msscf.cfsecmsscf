
// Description: Java 11 MssCF Binding for SecUser Column EMailConfirmUuid.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;

public class CFSecMssCFBindHasSecUserEMailConfirmUuid
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindHasSecUserEMailConfirmUuid() {
		super();
	}

	public CFSecMssCFBindHasSecUserEMailConfirmUuid( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecUser",
			"HasEMailConfirmUuid" );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindHasSecUserEMailConfirmUuid";

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

		if( genDef instanceof ICFSecSecUserObj ) {
			UUID eMailConfirmUuid = ((ICFSecSecUserObj)genDef).getOptionalEMailConfirmUuid();
			if( eMailConfirmUuid != null ) {
				return( "yes" );
			}
			else {
				return( "no" );
			}
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecUserObj" );
		}
	}
}
