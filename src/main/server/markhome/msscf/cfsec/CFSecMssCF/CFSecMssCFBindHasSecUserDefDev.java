
// Description: Java 11 MssCF Binding for SecUser Has DefDev.

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

public class CFSecMssCFBindHasSecUserDefDev
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindHasSecUserDefDev() {
		super();
	}

	public CFSecMssCFBindHasSecUserDefDev( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecUser",
			"HasDefDev" );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "expandBody";

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

		ICFSecSecDeviceObj obj;

		if( genDef instanceof ICFSecSecUserObj ) {
			obj = (ICFSecSecDeviceObj)((ICFSecSecUserObj)genDef).getOptionalLookupDefDev();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecUserObj" );
		}

		if( obj != null ) {
			return( "yes" );
		}
		else {
			return( "no" );
		}
	}
}
